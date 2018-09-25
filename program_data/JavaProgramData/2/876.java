public class Books
{
	public int num;
	public String author = new String(new char[26]);
}

package <missing>;

public class GlobalMembers
{
	public static Books[] a = tangible.Arrays.initializeWithDefaultBooksInstances(1000);

	public static int Main()
	{
		int n;
		int i;
		int j;
		int x;
		int max = 0;
		char letter = 'A';
		int[] b = new int[26];
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
				a[i].num = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a[i].author = tempVar3.charAt(0);
			}
		} //??a[];
		for (i = 0;i < n;i++)
		{
			for (j = 0;;j++)
			{
				if (a[i].author.charAt(j) >= 65 && a[i].author.charAt(j) <= 90)
				{
					x = a[i].author.charAt(j); //x:65-90
					b[x - 65]++;
				}
				else
				{
					break;
				}
			}
		} //?????
	//	for(i=0;i<26;i++)
	//	{
	//		printf("%d\n",b[i]);
	//	}
		for (i = 0;i < 26;i++)
		{
			if (b[i] > max)
			{
				max = b[i];
				letter = i + 65;
			}
		}
		System.out.printf("%c\n%d\n",letter,max);
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 26;j++)
			{
				if (a[i].author.charAt(j) == letter)
				{
					System.out.printf("%d\n",a[i].num);
				}
			}
		}
		return 0;
	}
}

