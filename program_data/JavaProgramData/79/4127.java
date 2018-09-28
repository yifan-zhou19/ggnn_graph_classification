public class str
{
  public int num;
  public str next;
}

package <missing>;

public class GlobalMembers
{
	public static str[] s1 = tangible.Arrays.initializeWithDefaultstrInstances(301); //?0?8?0?5?0?8?0?2?0?7?0?3?0?3?0?7?0?2?0?9301  ?0?5?0?6?0?6?0?2  ?0?3�?0?4?0?2?0?9?0?7��
	public static str[] s2 = tangible.Arrays.initializeWithDefaultstrInstances(301);
	public static str p1;
	public static str p2;

	public static int chq(int n,int k)
	{
		  int i;
		  int j;
		  if (n == 1)
		  {
			 return 1;
		  }
		  if (k == 1)
		  {
			 return n;
		  }
		  for (i = 1;i <= n - 1;i++)
		  {
			 for (j = 1;j <= k;j++)
			 {
				   p2 = p1;
				   p1 = p1.next;
			 }
			 p2.next = p1.next;
			 p1 = p2;
		  }
		  return (p1.num);

	}
	public static int Main()
	{
		int i;
		int j;
		int n;
		int m;
		int e;
		  for (i = 0;i <= 300;i++)
		  {
			s1[i].num = i;
			s1[i].next = s2[i + 1];
		  }
		  while (true)
		  {
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
		  if (n == 0 && m == 0)
		  {
			 break;
		  }
		  for (j = 0;j <= n;j++)
		  {
				 s2[j] = s1[j];
		  }
			  s2[n].next = s2[1];
			  p1 = s2[0];
			  e = chq(n, m);
			  System.out.printf("%d\n",e);


		  }


		   return 0;
	}
}

