package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[301]);
		int[] num = new int[26];
		int i;
		int j;
		int n;
		int p = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		n = a.length();
		for (i = 0;i < n;i++)
		{
			if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z')
			{
				  j = a.charAt(i) - 97;
			  num[j]++;
			}
		}
		for (j = 0;j < 26;j++)
		{
			if (num[j] > 0)
			{
			  p = (char)(j + 97);
		System.out.printf("%c=%d\n",p,num[j]);
			}
		}
		 if (p == 0)
		 {
		 System.out.print("No");
		 }
		 return 0;
	}
}

