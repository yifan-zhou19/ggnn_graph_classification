package mengka.tree_bfs_01;

import java.util.LinkedList;
import java.util.Queue;

/**
 *  ������������Ķ���
 * 
 * @author mengka.hyy
 *
 */
public class BfsQueue {

	private static Queue<String> queue = new LinkedList<String>();
	
	private BfsQueue(){		
	}
	
	public static BfsQueue getBfsQueue(){
		return BfsQueue_Holder.bfsQueue_holder;
	}
	
	public String pop(){
		return queue.poll();
	}
	
	public void push(String e){
		queue.offer(e);
	}
	
	public static class BfsQueue_Holder{
		private static BfsQueue bfsQueue_holder = new BfsQueue();
	}
}
