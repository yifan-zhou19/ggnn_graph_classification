package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String s = new String(new char[100]);
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  s = tempVar.charAt(0);
		  }
		  int a;
		  int[] b = new int[10000];
		  a = s.length();
		  int i;
		  int j;
		  int k;
		  for (i = 0;i < a;i++)
		  {
			  if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
			  {
						  s = tangible.StringFunctions.changeCharacter(s, i, s.charAt(i) - 'a'+'A');
			  }


		  }
		  int f = 0;
		  int t = 0;
		  for (i = f;i < a;i++)
		  {
			 f++;
			 b[s.charAt(i)]++;
			 if (s.charAt(i) != s.charAt(i + 1))
			 {

			 System.out.printf("(%c,%d)",s.charAt(i),b[s.charAt(i)]);
			 b[s.charAt(i)] = 0;
			 }


		  }

	}

}

