package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[101];
	public static int Main()
	{
	  int q = 0;
	  int temp;
	  int n;
	  int i;
	  int flag = 0;
	  int[] t = new int[200];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
	  memset(a,0,(Integer.SIZE / Byte.SIZE));
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  for (i = 0;i < n;i++)
		  {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  temp = Integer.parseInt(tempVar2);
		  }
		  if (a[temp] == 0)
		  {
		  t[q++] = temp;
		  }
		  a[temp]++;
		  }
		for (i = 0;i < q;i++)
		{
			if (flag == 0)
			{
				flag = 1;
			}
			else
			{
				System.out.print(" ");
			}
			System.out.printf("%d",t[i]);
		}
	}
}

