package <missing>;

public class GlobalMembers
{
	public static void Main()
	{

		int[] a = new int[1000];
		char[][] s = new char[1000][30];
		char ch;
		int[] b = new int[30];
		int i;
		int k;
		int n;
		int max = 0;

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
					a[i] = Integer.parseInt(tempVar2);
				}
				String tempVar3 = ConsoleInput.scanfRead(" ");
				if (tempVar3 != null)
				{
					s[i] = tempVar3.charAt(0);
				}
		}
		for (i = 0;i < n;i++)
		{
			for (ch = 'A';ch <= 'Z';ch++)
			{
				if (tangible.StringFunctions.strChr(s[i],ch) != null)
				{
					b[ch - 65]++;
				}
			}
		}


		for (i = 0;i <= 26;i++)
		{
			if (b[i] > max)
			{
				max = b[i];
				k = i;
			}
		}
			System.out.printf("%c\n%d\n",k + 65,max);
			ch = k + 65;
		for (i = 0;i < n;i++)
		{
			   if (tangible.StringFunctions.strChr(s[i],ch) != null)
			   {
				   System.out.printf("%d\n",a[i]);
			   }
		}



	}

}

