package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] aa = new int[10001];
		int i;
		int n;
		int a;
		int b;
		int j;
		int a1;
		int a2;
		int s = 0;
		int max;
		int[] bb = new int[10001];
		int min;
		int p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		min = 10000;
		max = 0;
		for (i = 0;i < 10001;i++)
		{
			aa[i] = 0;
		}
		for (i = 0;i < n;i++)
		{
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 a = Integer.parseInt(tempVar2);
			 }
			 String tempVar3 = ConsoleInput.scanfRead();
			 if (tempVar3 != null)
			 {
				 b = Integer.parseInt(tempVar3);
			 }
		 if (a < min)
		 {
			 min = a;
		 }
		 if (b > max)
		 {
			 max = b;
		 }
		 for (j = a;j < b;j++)
		 {
			 aa[j] = 1;
		 }
		}
		 for (i = min;i <= max;i++)
		 {
		  if (aa[i] == 1)
		  {
			  s++;
		  }
		  else
		  {
				a1 = i;
				a2 = i - s;
				p = s;
			   break;
		  }
		 }
			  if ((max - min) != p)
			  {
				  System.out.print("no");
			  }
			  else
			  {
			System.out.printf("%d %d",a2,a1);
			  }
			return 0;
	}
}

