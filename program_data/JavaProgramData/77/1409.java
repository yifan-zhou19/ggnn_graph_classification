package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String chn = new String(new char[120]);
		int i;
		int l;
		int z;
		int t;
		char a;
		char b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			chn = tempVar.charAt(0);
		}
		l = chn.length();
		a = chn.charAt(0);
		for (i = 0;i < l ;i++)
		{
		   if (chn.charAt(i) != a)
		   {
			  b = chn.charAt(i);
		   }
		}
		while (true)
		{
		  z = -1;
		  t = 0;
		  for (i = 0;i < l; i++)
		  {
			if (z == -1 && chn.charAt(i) == a)
			{
			   z = i;
			}
			else if (z >= 0 && chn.charAt(i) == b)
			{
				 System.out.printf("%d %d\n",z,i);
				 chn = chn.substring(0, z);
				 chn = chn.substring(0, i);
				 t++;
				 break;
			}
			else if (z >= 0 && chn.charAt(i) == a)
			{
			  z = i;
			}
		  }
		  if (t == 0)
		  {
			  break;
		  }
		}

	 return 0;
	}

}

