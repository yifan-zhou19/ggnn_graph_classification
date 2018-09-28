package <missing>;

public class GlobalMembers
{
	/*????strstr*/


	public static void Main()
	{
		final String s = "";
		final String w = "";
		int k;
		int t;
		String p;



		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			w = tempVar2.charAt(0);
		}

		k = w.length();
		t = s.length();


		p = tangible.StringFunctions.strStr(w,s);

		System.out.printf("%d",p - w);


	}
}

