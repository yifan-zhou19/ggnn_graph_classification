package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String a = new String(new char[6]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		int n;
		int i;
		for (i = 0;i <= 5;i++)
		{
		 if (a.charAt(i) == '\0')
		 {
		  n = i;
		  break;
		 }
		}
		for (i = n - 1;i >= 0;i--)
		{
			System.out.printf("%c",a.charAt(i));
		}
		System.out.print("\n");
	}
}

