package <missing>;

public class GlobalMembers
{
	public static void find(int[] a, String str)
	{
		int i = 0;
		int k = 0;
		for (i = 0;i < 52;i++)
		{
			a[i] = 0;
		}
		for (k = 0; !str[k].equals('\0');k++)
		{
			for (i = 0;i < 26;i++)
			{
				if (str[k].equals('a') + i)
				{
				a[i]++;
				}
			}
		}
		for (k = 0; !str[k].equals('\0');k++)
		{
			for (i = 0;i < 26;i++)
			{
				if (str[k].equals('A') + i)
				{
					a[i + 26]++;
				}
			}
		}
	}
	public static void Main()
	{
		String str1 = new String(new char[100]);
		String str2 = new String(new char[100]);
		int[] a = new int[52];
		int[] b = new int[52];
		int i;
		int n = 0;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p1,*p2;
		int p1;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p2;
		int p2;
		p1 = a;
		p2 = b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			str2 = tempVar2.charAt(0);
		}
		find(a, str1);
		find(b, str2);

		for (i = 0;i < 52;i++)
		{
			if (*(p1 + i) == *(p2 + i))
			{
				n++;
			}
		}
		if (n == 52)
		{
			System.out.print("YES");
		}
		else
		{
			System.out.print("NO");
		}
	}












}

