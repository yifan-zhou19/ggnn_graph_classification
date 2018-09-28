package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String s = new String(new char[1000]);
	int n;
	int f;
	int k;
	k = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	System.in.read();
	for (k = 0;k < n;k++)
	{
		s = new Scanner(System.in).nextLine();
					   f = 1;
				  if (s.charAt(0) == '_' || (s.charAt(0) <= 'Z' && s.charAt(0) >= 'A') || (s.charAt(0) <= 'z' && s.charAt(0) >= 'a'))
				  {
								 for (int i = 0;i < s.length();i++)
								 {
							 /*if(s[i]=='_'||(s[i]>='A'&&s[i]<='Z')||(s[i]<='z'||s[i]>='a')||(s[i]>='0'&&s[i]<='9'));
							 else
							 {
							  f=0;break;
							  }*/
							  if (s.charAt(i) < 48 || (s.charAt(i)>57 && s.charAt(i) < 65) || (s.charAt(i)>90 && s.charAt(i) < 95) || (s.charAt(i)>95 && s.charAt(i) < 97) || s.charAt(i)>122)
							  {
							  f = 0;
							  break;
							  }
								 }
				  }
							  else
							  {
								  f = 0;
							  }
							  System.out.printf("%d\n",f);
	}
	}

}

