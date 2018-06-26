package Problems;

import java.util.ArrayList;
import java.util.List;

public class reOrderLogFile {
	public static void main(String args[]) {
		List<String> logfile = new ArrayList<String> ();
		logfile.add("a1 4 2 3 1");
		logfile.add("g1 Act car");
		logfile.add("zo4 9 7");
		logfile.add("p2 7 7 2");
		logfile.add("ab1 Act KEY dog");
		logfile.add("a8 act zoo");//Always use add when initialize
		List<String> result = new ArrayList<String> ();
		reorderLogFileMethod(logfile,result);
		for(int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i));
		}
	}
	
	public static void reorderLogFileMethod(List<String> logfile, List<String> result) {
		List<logString> logObjectlist = new ArrayList<logString> ();
		for(int i = 0; i < logfile.size(); i++) {
			String parts[] = logfile.get(i).split(" ", 2);
			//System.out.println(parts[1]);
			logObjectlist.add(new logString(parts[0],parts[1]));
		}
		//System.out.println(logObjectlist.size());
		bubbleSort(logObjectlist);
		for(int i = 0; i < logObjectlist.size(); i++) {
			result.add(logObjectlist.get(i).getId() + " " + logObjectlist.get(i).getContent());
			//System.out.println(result.get(i));
		}
	}

	
    static void bubbleSort(List<logString> arr)
    {
        int n = arr.size();
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr.get(j).compareTo(arr.get(j+1)) > 0)
                {
                    // swap temp and arr[i]
                	logString temp = arr.get(j);
                    arr.set(j, arr.get(j+1));
                    arr.set(j+1, temp);
                }
    }
   
}

class logString implements Comparable<logString>{
	private String id;
	private String content;
	
	logString(String id, String content) {
		this.id = id;
		this.content = content;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}	
	@Override
	public int compareTo(logString o) {
		// TODO Auto-generated method stub
		if(isNumeric(o.content.split("\\s+")[0]) && isNumeric(content.split("\\s+")[0])) {
			return -1;
		} else if(isNumeric(o.content.split("\\s+")[0])) {
			return -1;
		} else if (isNumeric(content.split("\\s+")[0])) {
			return 1;
		} else {
			if(content.compareTo(o.content) == 0) {
				return id.compareTo(o.id);
			}
			else {
		        return content.compareTo(o.content);				
			}	
		}
	}
	
	public static boolean isNumeric(String str)
	{
	  return str.matches("-?\\d+(\\.\\d+)?");  //match a number with optional '-' and decimal.
	}
	
	
}
