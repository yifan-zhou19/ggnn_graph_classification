package <missing>;

public class GlobalMembers
{
	public static int i;
	public static int j;
	public static int k;
	public static int[] f = new int[80];
	public static int panduan()
	{
		String ch = new String(new char[80]);
		ch = new Scanner(System.in).nextLine();
		int m = ch.length();
		if ((ch.charAt(0) == 95) || (ch.charAt(0) <= 90 && ch.charAt(0) >= 65) || (ch.charAt(0) <= 122 && ch.charAt(0) >= 97))
		{
			f[j] = 1;
			for (i = 1;i < m;)
			{
				 if (((ch.charAt(i) < 65 && ch.charAt(i)>58) || (ch.charAt(i) < 48) || ((ch.charAt(i)>90 && ch.charAt(i) <= 94) || (ch.charAt(i) == 96))) || (ch.charAt(i)>122))
				 {
					 f[j] = 0;
					 break;
				 }
				 else
				 {
					 i++;
				 }
			}
		}
		else
		{
			f[j] = 0;
		}
		return f[j];
	}

	public static int Main()
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (j = 0;j < k;j++)
		{
			panduan();
		}
		for (j = 0;j < k;j++)
		{
			System.out.printf("%d\n",f[j]);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			i = Integer.parseInt(tempVar2);
		}
		return 0;
	}
}

