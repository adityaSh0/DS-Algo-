//package ArrayList;
//
//import java.util.ArrayList;
//
//public class MergeIntervals {
//		
//	    public ArrayList<Integer> insert(ArrayList<Integer> intervals, Integer newInterval) {
//	    	
//	        if(intervals==null){
//	            intervals=new ArrayList<Integer>();
//	            intervals.add(newInterval);
//	            return intervals;
//	        }else if(intervals.size()==0){
//	            intervals.add(newInterval);
//	            return intervals;
//	        }
//	        Integer toinsert=newInterval;
//	        int i=0;
//	        while(i<intervals.size()){
//	            Integer current=intervals.get(i);
//	            if(current.end<toinsert.start){
//	                i++;
//	                continue;
//	            }else if(current.start>toinsert.end){
//	                intervals.add(i,toinsert);
//	                break;
//	            }
//	            else{
//	                toinsert.start=Math.min(toinsert.start,current.start);
//	                toinsert.end=Math.max(toinsert.end,current.end);
//	                intervals.remove(i);
//	            }
//	        }
//	        if(i==intervals.size()){
//	            intervals.add(toinsert);
//	        }
//	        return intervals;
//	    }
//}
