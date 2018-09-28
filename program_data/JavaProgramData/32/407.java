package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		for (j = 0;j < n;j++)
		{
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   a = tempVar2.charAt(0);
		   }
		   String tempVar3 = ConsoleInput.scanfRead();
		   if (tempVar3 != null)
		   {
			   b = tempVar3.charAt(0);
		   }

		   int r = a.length();
		   int t = b.length();
			String p1;
			String p2;
			String p3;
			p1 = a;
			p2 = b;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p3 = (String)malloc((r + 1) * (Character.SIZE / Byte.SIZE));
			p3 = a;
		   for (i = 1;i <= t;i++)
		   {
				if (p1.charAt(r - i) - p2.charAt(t - i) < 0)
				{
				  p3 = tangible.StringFunctions.changeCharacter(p3, r - i, p1.charAt(r - i) + 10 - p2.charAt(t - i) + '0');
				  p1.charAt(r - i - 1)--;
				  p3.charAt(r - i - 1)--;
				}
				else
				{
				  p3 = tangible.StringFunctions.changeCharacter(p3, r - i, p1.charAt(r - i) - p2.charAt(t - i) + '0');
				}
		   }

		System.out.printf("%s\n",p3);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(p3);
		}
	return 0;
	}


}

