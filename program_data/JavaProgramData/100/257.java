package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int num = new int(int i,char letter[100]);
		String letter = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			letter = tempVar.charAt(0);
		}
		int count = letter.length();
		int i;
		int j = 0;
		int k = 0;
		int[] a = new int[30];
		for (i = 0;i < 26;i++)
		{
			a[i] = num(i, letter);
		}
		for (i = 0;i < 26;i++)
		{
			if (a[i] > 0)
			{
				j++;
			}
		}
		if (j == 0)
		{
			System.out.print("No");
		}
		else if (j > 0)
		{
			for (i = 0;i < 26;i++)
			{
				if ((a[i] > 0) && (k < j))
				{
					System.out.printf("%c=%d\n",i + 97,a[i]);
					k++;
				}
				else if ((a[i] > 0) && (k == j))
				{
					System.out.printf("%c=%d",i + 97,a[i]);
				}
			}
		}
	}
	public static int num(int i, String letter)
	{
		int j;
		int l = 0;
		for (j = 0;;j++)
		{
			if (letter[j].equals(i + 97))
			{
				l++;
			}
			if (letter[j].equals('\0'))
			{
				break;
			}
		}
		return (l);
	}
}

