package <missing>;

public class GlobalMembers
{
	public static int f(int x)
	{
		int i;
		int z;
		z = 1;
		for (i = 2;i <= x / 2;i++)
		{
				if (x % i == 0)
				{
					z = 0;
				}
		}
		return (z);
	}

	public static int g(int x)
	{
		char[] str = {'0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		int j = 0;
		int i;
		int z = 1;
		while (x > 0)
		{
			str[j] = x % 10 + '0';
			x = x / 10;
			j++;
		}
		for (i = 0;i < j;i++)
		{
			if (str[i] != str[j - 1 - i])
			{
				z = 0;
			}
		}
		return (z);
	}
	public static void Main()
	{
		int m;
		int n;
		int i;
		int[] a = new int[1000];
		int k = 0;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   m = Integer.parseInt(tempVar);
	   }
	   String tempVar2 = ConsoleInput.scanfRead(" ");
	   if (tempVar2 != null)
	   {
		   n = Integer.parseInt(tempVar2);
	   }
	   for (i = m;i <= n;i++)
	   {
		   if (f(i) != 0 && g(i) != 0)
		   {
			   a[k] = i;
			   k++;
		   }
	   }
	   if (a[0] == 0)
	   {
		   System.out.print("no");
	   }
	   else
	   {
		   System.out.printf("%d",a[0]);
		   for (i = 1;i < k;i++)
		   {
			   System.out.printf(",%d",a[i]);
		   }
	   }

	}
}

