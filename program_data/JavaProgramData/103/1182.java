package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String s = new String(new char[1000]);
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  s = tempVar.charAt(0);
		  }
		  int length = s.length();
		  int i;
		  int j = 0;
		  for (i = 0;i < length;i++)
		  {
		  if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
		  {
		  s.charAt(i) += 'A'-'a';
		  }
		  }
		  int[] num = new int[26];
		  for (i = 0;i < 26;i++)
		  {
		  num[i] = 1;
		  }
		  final String mem = "";
		  mem = tangible.StringFunctions.changeCharacter(mem, 0, s.charAt(0));
		  for (i = 1;i < length;i++)
		  {
							   if (s.charAt(i) == s.charAt(i - 1))
							   {
							   num[j]++;
							   }
							   else
							   {
								   j++;
								mem = tangible.StringFunctions.changeCharacter(mem, j, s.charAt(i));
							   }
		  }
		  int changdu = mem.length();
		  for (j = 0;j < changdu;j++)
		  {
		  System.out.printf("(%c,%d)",mem.charAt(j),num[j]);
		  }
	}

}

