package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int s1 = 0;
		int t;
		int s2 = 0;
		String a = new String(new char[200]);
		String b = new String(new char[200]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0,j = 0;i < n,j < n;i++,j++)
		{
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  a = tangible.StringFunctions.changeCharacter(a, i, tempVar2);
			  }
			  String tempVar3 = ConsoleInput.scanfRead(" ");
			  if (tempVar3 != null)
			  {
				  b = tangible.StringFunctions.changeCharacter(b, j, tempVar3);
			  }
			  t = a.charAt(i) - b.charAt(i);
			  if (t == -1 || t == 2)
			  {
					s1++;
			  }
			  else
			  {
				if (t == 1 || t == -2)
				{
					  s2++;
				}
			  }
		}
		if (s1 == s2)
		{
			System.out.print("Tie");
		}
		else
		{
		  if (s1 > s2)
		  {
				System.out.print("A");
		  }
		  else
		  {
			if (s1 < s2)
			{
				  System.out.print("B");
			}
		  }
		}
		return 0;
	}
}

