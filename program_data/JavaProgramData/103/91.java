package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  String s = new String(new char[1001]);
	  String word = new String(new char[1001]);
	  int i;
	  int len;
	  int count;
	  int[] num = new int[1001];
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  s = tempVar.charAt(0);
	  }
	  len = s.length();
	  for (i = 0;i < 1001;i++)
	  {
		  num[i] = 1;
	  }
	  count = 1;
	  for (i = 0;i <= len - 1;i++)
	  {
		if ((s.charAt(i) >= 'a') && (s.charAt(i) <= 'z'))
		{
			s = tangible.StringFunctions.changeCharacter(s, i, s.charAt(i) - 'a'+'A');
		}
	  }
	  for (i = 0;i <= len - 1;i++)
	  {
		word = tangible.StringFunctions.changeCharacter(word, count, s.charAt(i));
		if (s.charAt(i) == s.charAt(i + 1))
		{
			num[count]++;
		}
		else
		{
			count++;
		}
	  }
	  for (i = 1;i <= count - 1;i++)
	  {
		System.out.printf("(%c,%d)",word.charAt(i),num[i]);
	  }
	}

}

