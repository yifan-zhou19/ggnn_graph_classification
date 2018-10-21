package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  String s = new String(new char[101]);
	  int[] m = new int[100];
	  int i;
	  int j;
	  int l1;
	  int l2;
	  int k;
	  int h;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  s = tempVar.charAt(0);
	  }
	  l1 = s.length();
	  if ((((s.charAt(0) - '0') * 10 + (s.charAt(1) - '0')) < 13 && s.charAt(2) == '\0') || ((s.charAt(0) - '0') < 13 && s.charAt(1) == '\0'))
	  {
			System.out.print("0\n");
		 System.out.printf("%s\n",s);
	  }
	  else
	  {
		 for (i = 0;i < l1 - 1;i++)
		 {
			k = (s.charAt(i) - '0') * 10 + (s.charAt(i + 1) - '0');
		  j = k / 13;
		  h = k - 13 * j;
		  s = tangible.StringFunctions.changeCharacter(s, i + 1, h + '0');
		  m[i] = j;
		 }
	  int b = 0;
	  l2 = i + 1;
	  for (i = 0;i < l2;i++)
	  {
			if (m[i] == 0)
			{
			 b++;
			}
		  else
		  {
			  break;
		  }
	  }
	  for (i = b;i < l2 - 1;i++)
	  {
		 System.out.printf("%d",m[i]);
	  }
	  System.out.print("\n");
	  System.out.printf("%d\n",h);
	  }
	  return 0;
	}
}

