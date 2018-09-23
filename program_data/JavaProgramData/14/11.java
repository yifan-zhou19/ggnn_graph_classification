public class stu
{
   public float num;
   public float chi;
   public float mat;
   public float total;
   public stu next;
}

package <missing>;

public class GlobalMembers
{
	public static stu creat(int n)
	{
	   int i;

	   stu head;
	   stu p1;
	   stu p2;
			for (i = 0;i < n;i++)
			{
			   p1 = new stu();
			   String tempVar = ConsoleInput.scanfRead();
			   if (tempVar != null)
			   {
				   p1.num = Float.parseFloat(tempVar);
			   }
			   String tempVar2 = ConsoleInput.scanfRead(" ");
			   if (tempVar2 != null)
			   {
				   p1.chi = Float.parseFloat(tempVar2);
			   }
			   String tempVar3 = ConsoleInput.scanfRead(" ");
			   if (tempVar3 != null)
			   {
				   p1.mat = Float.parseFloat(tempVar3);
			   }
			   p1.total = p1.chi + p1.mat;
			   if (i == 0)
			   {
				   head = p2 = p1;
			   }
			   else
			   {
				   p2.next = p1;
				   p2 = p1;
			   }
			}
	   p2.next = null;
	   return (head);

	}


	public static void Main()
	{
			int n;
			int i;
			int j;
			float max;
			stu head;
			stu maxi;
			stu p;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			head = creat(n);


			for (i = 0;i < 3;i++)
			{
					p = head;
					maxi = head;
					max = head.total;
				for (j = 0;j < n - 1;j++)
				{
					p = p.next;
					if (p.total > max)
					{
						max = p.total;
						maxi = p;
					}
				}

				System.out.printf("%g %g\n",maxi.num,maxi.total);
				maxi.total = 0F;
			}
	}

}

