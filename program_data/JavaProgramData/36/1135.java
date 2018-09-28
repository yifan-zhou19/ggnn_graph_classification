package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String p1 = new String(new char[500]);
		String p2 = new String(new char[500]);
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  p1 = tempVar.charAt(0);
	  }
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  p2 = tempVar2.charAt(0);
	  }
	  int n;
	  int i;
	  int j;
	  int m;
	  m = p1.length();
	  n = p2.length();
	  int[] num1 = new int[26];
	  int[] num2 = new int[26];
	  String alpha = new String(new char[26]);
	  for (i = 0;i < 26;i++)
	  {
		  num1[i] = 0;
		  num2[i] = 0;
		  alpha = tangible.StringFunctions.changeCharacter(alpha, i, 'a' + i);
	  }
	  for (i = 0;i < m;i++)
	  {
		  for (j = 0;j < 26;j++)
		  {
			if (p1.charAt(i) == alpha.charAt(j))
			{
		  num1[j]++;
			}
		  }
	  }
	  for (i = 0;i < n;i++)
	  {
		  for (j = 0;j < 26;j++)
		  {
			if (p2.charAt(i) == alpha.charAt(j))
			{
		  num2[j]++;
			}
		  }
	  }
	  int count = 0;
	  for (i = 0;i < 26;i++)
	  {
		  if (num1[i] == num2[i])
		  {
	   count++;
		  }
	  }
	  if (count == 26)
	  {
	  System.out.print("YES\n");
	  }
	  else
	  {
		  System.out.print("NO\n");
	  }
	  return 0;
	}

}

