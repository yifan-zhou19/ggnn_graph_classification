package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[200]);
		String w = new String(new char[100]);

		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			w = tempVar2.charAt(0);
		}


		for (i = 0;i < 100;i++)
		{
			if (w.Substring(i) == tangible.StringFunctions.strStr(w,s))
			{
				System.out.printf("%d",i);
				break;
			}
		}
	}

}

