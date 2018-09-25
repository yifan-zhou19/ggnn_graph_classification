package <missing>;

public class GlobalMembers
{
	public static int l = 0;
	public static int[] shang = new int[100];
	public static String num = new String(new char[100]);
	public static int first;
	public static int n;
	public static void count()
	{
		if (l == n - 1)
		{
		return;
		}
		else if (l != n - 2)
		{
			shang[l] = first / 13;
			first = (first - 13 * shang[l]) * 10 + (num.charAt(l + 2) - '0');
			l++;
			count();
		}
		else
		{
			shang[l] = first / 13;
			first = first - 13 * shang[l];
			l++;
			count();
		}
	}
	public static int Main()
	{
		num = ConsoleInput.readToWhiteSpace(true).charAt(0);
		n = num.length();
		if (n == 1)
		{
		  System.out.print("0");
		  System.out.print("\n");
		  System.out.print(num);
		}
		else if (n == 2)
		{
			first = (num.charAt(0) - '0') * 10 + (num.charAt(1) - '0');
			if (first < 13)
			{
				System.out.print("0");
				System.out.print("\n");
				System.out.print(num);
			}
			else
			{
					count();
			if (shang[0] == 0)
			{
		   for (int j = 1;j < n - 1;j++)
		   {
			   System.out.print(shang[j]);
		   }
			}
	   else
	   {
			for (int i = 0;i < n - 1;i++)
			{
		System.out.print(shang[i]);
			}
	   }
		System.out.print("\n");
		System.out.print(first);
			}
		}
		else
		{
	   {
		   first = (num.charAt(0) - '0') * 10 + (num.charAt(1) - '0');
		count();
	   if (shang[0] == 0)
	   {
		   for (int j = 1;j < n - 1;j++)
		   {
			   System.out.print(shang[j]);
		   }
	   }
	   else
	   {
			for (int i = 0;i < n - 1;i++)
			{
		System.out.print(shang[i]);
			}
	   }
		System.out.print("\n");
		System.out.print(first);
	}
		}
		return 0;
	}

}

