import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class AdeethQ1 {

	public static void main(String[] args) {
		int numberOfFiles = 4;
		List<Integer> files = new ArrayList<Integer>();
		files.add(8);
		files.add(4);
		files.add(6);
		files.add(12);
		//files.add((int) Math.pow(10,12));
		
		
		//files.add(8);
		//System.out.println(Integer.MAX_VALUE);
		AdeethQ1 q1 = new AdeethQ1();
		//System.out.println(q1.minimumTime(numberOfFiles, files));
		
		System.out.println(q1.minTime(numberOfFiles, files));

	}
	
	
	int minTime(int numOfSubFiles, List<Integer> files) {
		Collections.sort(files);
		if(files.size() == 0) return 0;
		if(files.size() == 1) return files.get(0);
		int res = files.get(0)+ files.get(1);
		int temp = res;
		for(int i=1; i<files.size(); i++) {
			//temp += files.get(i);
			//res += temp;
			files.set(i, files.get(i)+files.get(i-1));
		}
		//return res;
		return files.get(files.size()-1);
	}
	
	
	
	
	int minimumTime(int numOfSubFiles, List<Integer> files){
        
		if(files == null) {
			return 0;
		}
		
		int result =0;        
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int file : files){
            pq.add(file);
        }
        int temp=0;
        if(pq.size() == 0)
            return 0;
        if(pq.size() == 1)
            return pq.poll();
        while(pq.size()>1)
        {

        	int first = pq.poll();
            int second = pq.poll();
            temp = first+second;
            if(Integer.MAX_VALUE - result > temp) {
            	return Integer.MAX_VALUE;
            }else {
            	result+=temp;
            }
            pq.add(temp);
            
        }
        
        return result;
                
    }
	
}
