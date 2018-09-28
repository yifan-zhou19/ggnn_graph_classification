package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  String s = new String(new char[256]);
	  String s1 = new String(new char[256]);
	  String t = new String(new char[256]);
	  int j;
	  int ls1;
	  int lt;
	  int i;
	  int k = 0;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  s = tempVar.charAt(0);
	  }
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  s1 = tempVar2.charAt(0);
	  }
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  t = tempVar3.charAt(0);
	  }
	  ls1 = s1.length();
	  lt = t.length();
	  for (i = 0;s.charAt(i);i++)
	  {
		if (s.charAt(i) == s1.charAt(k))
		{
		  k++;
		  if (k == ls1 - 1)
		  {
			break;
		  }
		}
		else
		{
		  k = 0;
		}
	  }

	  if (i >= s.length())
	  {
		System.out.printf("%s\n",s);
	  }
	  else
	  {
	  for (j = 0;j < i - ls1 + 2;j++)
	  {
		System.out.printf("%c",s.charAt(j));
	  }
	  System.out.printf("%s",t);
	  for (j = i + 2;j < s.length();j++)
	  {
		System.out.printf("%c",s.charAt(j));
	  }
	  System.out.print("\n");
	  }
	}


}

