public class stu
{
	 public String inf = new String(new char[100]);
	 public stu next;
}

package <missing>;

public class GlobalMembers
{
	public static void down(stu now)
	{
		 if (now.next != 0)
		 {
			 down(now.next);
		 }
		 if (now.next != 0)
		 {
			 System.out.printf("%s\n",now.inf);
		 }
	}


	public static int Main()
	{
		void down(struct stu * now);
		stu head;
		stu now;
		stu neww;
		head =  new stu();
		head.next = null;
		head.inf = new Scanner(System.in).nextLine();
		now = head;
		 do
		 {
		   neww =  new stu();
		   neww.next = null;
		   neww.inf = new Scanner(System.in).nextLine();
		   now.next = neww;
		   now = neww;
											 //      printf("%s\n",now->inf);

		 }while (strcmp(now.inf,"end") != 0);
		down(head);
	 //   int i;scanf("%d",&i); 
		return 0;
	}

}
