package <missing>;

public class GlobalMembers
{
	// ???.cpp : Defines the entry point for the console application.
	//


	public static void Main(String[] args)
	{
		String a = new String(new char[1000]);
		String b = new String(new char[1000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		int lena = a.length();
		int lenb = b.length();
		if (lena != lenb)
		{
			System.out.print("NO");
		}
		else
		{
			int i;
			int j;
			int k = 0;
			int num = 0;
			int count = 0;
			int same = 0;
			int[] tong = new int[1000];
			for (i = 0;i < 1000;i++)
			{
				tong[i] = 0;
			}
			for (i = 0;i < lena;i++)
			{
				for (j = i + 1;j < lena;j++)
				{
					if (a.charAt(i) == a.charAt(j))
					{
						tong[k]++;
						num++;
					}
				}
			}
			for (i = 0;i < num;i++)
			{
				same = same + tong[i] + 1;
			}
			for (i = 0;i < lena;i++)
			{
				for (j = 0;j < lenb;j++)
				{
					if (a.charAt(i) == b.charAt(j))
					{
						count++;
					}
				}
			}
			if (count == lena + same)
			{
				System.out.print("YES");
			}
			else
			{
				System.out.print("NO");
			}
		}
	}


}

