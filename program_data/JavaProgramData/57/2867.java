package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int l;
	String s = new String(new char[100]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 1;i <= n;i++)
	{
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 s = tempVar2.charAt(0);
	 }
	 l = s.length();
	 if (s.charAt(l - 1) == 'g')
	 {
		 s = s.substring(0, l);
		 s = s.substring(0, l - 1);
		 s = s.substring(0, l - 2);
		 s = s.substring(0, l - 3);
	 }
	 else
	 {
		 s = s.substring(0, l);
		 s = s.substring(0, l - 1);
		 s = s.substring(0, l - 2);
	 }
	 l = s.length();
	 System.out.printf("%s\n",s);
	}
	return 0;
	}
}

