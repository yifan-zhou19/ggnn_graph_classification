package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int m;
		int i;
		int j;
		int max = 0;
		int min = 100;
		char[][] str = new char[201][255];
		int[] a = new int[201];
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
				str[i] = tempVar2.charAt(0);
			}
			System.in.read();
			a[i] = String.valueOf(str[i]).length();
			if (a[i] > max)
			{
				max = a[i];
			}
			if (a[i] < min)
			{
				min = a[i];
			}
		}
		//printf("%d %d",max,min);
		for (i = 0;i < n;i++)
		{
			if (a[i] == max)
			{
			 System.out.println(str[i]);
		  System.out.print("\n");
		  break;
			}
		}
		for (i = 0;i < n;i++)
		{
		 if (a[i] == min)
		 {
			System.out.println(str[i]);
		 System.out.print("\n");
		 break;
		 }
		}
	}


}

