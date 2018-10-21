package <missing>;

public class GlobalMembers
{
	public static int judge(int i, String s, String sub)
	{
		/*printf("%d\n",i);
		printf("%s\n",sub);*/
		int j;
		int k;
		for (j = i;j <= i + sub.length() - 1;j++)
		{
		if (!s[j].equals(sub[j - i]))
		{
			break;
		}
		}
		if (j == i + sub.length())
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static void change(int i, String s, String sub, String r)
	{
		 int l;
		 int ls;
		 int lr;
		 int j;
		 int k;
		 l = s.length();
		 ls = sub.length();
		 lr = (r.length());
		 /*printf("%d",i);*/
		 if (ls <= lr)
		 {
			 k = lr - ls;
					   for (j = l + k + 1;j >= i + lr;j--)
					   {
						   s[j] = s[j - k];
					   }
					   for (j = i;j <= i + lr - 1;j++)
					   {
					   s[j] = r[j - i];
					   }
		 }
		 else
		 {
			 k = ls - lr;
			   for (j = i + lr;j <= l - k + 1;j++)
			   {
				   s[j] = s[j + k];
			   }
			   for (j = i;j <= i + lr - 1;j++)
			   {
			   s[j] = r[j - i];
			   }
		 }
	}
	public static int Main()
	{
		  String s = new String(new char[800]);
		  String sub = new String(new char[800]);
		  String r = new String(new char[800]);
		  int l;
		  int i;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  s = tempVar.charAt(0);
		  }
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  sub = tempVar2.charAt(0);
		  }
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  r = tempVar3.charAt(0);
		  }
		  l = s.length();
		  for (i = 0;i < l;i++)
		  {
		  if ((s.charAt(i) == sub.charAt(0)) && (judge(i, s, sub) > 0))
		  {
		  change(i, s, sub, r);
		  break;
		  }
		  }
		  System.out.println(s);
	}

}

