package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] a = new char[200][40];
		int[] len = new int[200];
		int i = 0;
		int n;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		leap:
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[i] = tempVar.charAt(0);
		}
		len[i] = String.valueOf(a[i]).length();
		i++;
		if (System.in.read() == ' ')
		{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			goto leap;
		}
		n = i;
		for (i = 0;i < n - 1;i++)
		{
			System.out.printf("%d,",len[i]);
		}
		System.out.printf("%d",len[n - 1]);
	}
}

