package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[1000]);
		String b = new String(new char[1000]);
		int[] c = new int[52];
		int[] d = new int[52];
		int numa;
		int numb;
		int i;
		int j;
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
		numa = a.length();
		numb = b.length();
		for (j = 0;j < 26;j++)
		{
			 for (i = 0;i < numa;i++)
			 {
				 if (a.charAt(i) == 'A' + j)
				 {
					 c[j]++;
				 }
			 }
			 for (i = 0;i < numb;i++)
			 {
				 if (b.charAt(i) == 'A' + j)
				 {
					 d[j]++;
				 }
			 }
		}
		for (j = 26;j < 52;j++)
		{
			 for (i = 0;i < numa;i++)
			 {
				 if (a.charAt(i) == 'a' + j - 26)
				 {
					 c[j]++;
				 }
			 }
			 for (i = 0;i < numb;i++)
			 {
				 if (b.charAt(i) == 'a' + j - 26)
				 {
					 d[j]++;
				 }
			 }
		}
		for (i = 0;i < 51;i++)
		{
			if (c[i] != d[i])
			{
				System.out.print("NO");
				break;
			}
		}
		if (i == 51)
		{
			System.out.print("YES");
		}
	}
}

