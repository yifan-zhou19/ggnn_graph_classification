package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zfc = new String(new char[256]);
		String zc = new String(new char[256]);
		String re = new String(new char[256]);
		char[][] dc = new char[256][256];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			zfc = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			zc = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			re = tempVar3.charAt(0);
		}
		int len1;
		int len2;
		int i;
		len1 = zfc.length();
		len2 = zc.length();
		int j;
		int k;
		int tag = 0;
		int m;
		int a;
		for (i = 0;zfc.charAt(i + len2 - 1) != '\0';i++)
		{
			  k = i;
			 for (j = 0;j < len2;j++,k++)
			 {
								 dc[i][j] = zfc.charAt(k);
			 }
		}
		for (i = 0;zfc.charAt(i + len2 - 1) != '\0';i++)
		{
			   if (strcmp(dc[i],zc) == 0)
			   {
						tag = 1;
						m = i;
						break;
			   }
		}

		if (tag == 0)
		{
				   System.out.printf("%s\n",zfc);
		}
		else
		{
			 for (i = 0;i < m;i++)
			 {
							   System.out.printf("%c",zfc.charAt(i));
			 }
			 for (i = m;i < m + len2;i++)
			 {
								   System.out.printf("%s",re);
								   break;
			 }
			 for (i = m + len2;zfc.charAt(i) != '\0';i++)
			 {
											System.out.printf("%c",zfc.charAt(i));
			 }
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			a = Integer.parseInt(tempVar4);
		}
		 return 0;
	}



}

