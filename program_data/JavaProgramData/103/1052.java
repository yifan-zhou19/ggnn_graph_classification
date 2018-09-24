package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int r = 0;
		  int n;
		  int i = 0;
		  int j = 0;
		  int x = 0;
		  int y = 0;
		  int[] z = new int[1000];
		  String a = new String(new char[1000]);

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
			 a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 32);
			 }
		  }



		  for (x = 0;x <= n;x++)
		  {
			 j = 0;
			 z[x] = 0;
			 if (x > 0 && a.charAt(x) == a.charAt(x - 1))
			 {
			 continue;
			 }
			for (y = x;y <= n;y++)
			{
			   if (a.charAt(y) == a.charAt(x))
			   {
				z[x]++;
			   }
			   else
			   {
				System.out.printf("(%c,%d)",a.charAt(x),z[x]);
				break;
			   }
			}
		  }


	}

}

