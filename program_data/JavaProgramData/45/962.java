package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	  String s = new String(new char[52]);
	  String w = new String(new char[52]);
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  s = tempVar.charAt(0);
	  }
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  w = tempVar2.charAt(0);
	  }
	  int len1; //s?w???? ??????
	  int len2;
	  int i;
	  int m;
	  int num;
	  len1 = s.length();
	  len2 = w.length();

	  for (i = 0;i <= len2 - len1;i++)
	  { //w[i]==s[0]
								for (m = 0,num = 0;m < len1;m++)
								{
													if (w.charAt(i + m) - s.charAt(m) == 0)
													{

																	 num++;
																	 continue;
													}
								}
								if (num == len1)
								{
											break;
								}
	  }

	  System.out.printf("%d\n",i);

	}

}

