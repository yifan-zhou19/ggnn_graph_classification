package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String yuan = new String(new char[256]);
		String jiu = new String(new char[256]);
		String xin = new String(new char[256]);
		int i;
		int j;
		int len;
		int n = 0;
		int len1;
		int[] u = new int[256];
		int[] jishu = new int[256];
		int len2;
		int k;
		int weizhi;
		int sum = 0;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 yuan = tempVar.charAt(0);
		 }
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 jiu = tempVar2.charAt(0);
		 }
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 xin = tempVar3.charAt(0);
		 }
		 len1 = yuan.length();
		 len2 = jiu.length();
		  for (i = 0;i < len1;i++)
		  {
			 if (yuan.charAt(i) == jiu.charAt(0))
			 {
				 u[n] = i;
				 n++;
			 }
		  }
		  for (i = 0;i < n;i++)
		  {
			  for (j = u[i],k = 0;j < u[i] + len2,k < len2;j++,k++)
			  {
				  if (yuan.charAt(j) != jiu.charAt(k))
				  {
					  jishu[i]++;
				  }
			  }
		  }
		for (i = 0;i < n;i++)
		{
					   if (jishu[i] == 0)
					   {
						   sum++;
					   }
		}
					   if (sum == 0)
					   {
						   System.out.printf("%s",yuan);
					   }
					   else
					   {
		  for (i = 0;i < n;i++)
		  {
					   if (jishu[i] == 0)
					   {
						   weizhi = u[i];
	break;
					   }
		  }

		  for (i = weizhi,k = 0;i < weizhi + len2,k < len2;i++,k++)
		  {
			  yuan = tangible.StringFunctions.changeCharacter(yuan, i, xin.charAt(k));
		  }
		  System.out.printf("%s",yuan);


					   }


		return 0;
	}
}

