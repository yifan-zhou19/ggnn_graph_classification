package <missing>;

public class GlobalMembers
{
	public static void bubble(int[][] x, int n) //&Ecirc;&yacute;��&Atilde;�&Aring;&Yacute; &pound;&not;n&Icirc;&ordf;&Ecirc;&yacute;��&sup3;�&para;&Egrave;
	{
		int i;
		int j;
		int y;
		for (i = 1;i < n;i++)
		{
			for (j = 0;j < n - i;j++)
			{
				if (x[j][1] > x[j + 1][1])
				{
					y = x[j][0];
					x[j][0] = x[j + 1][0];
					x[j + 1][0] = y;
					y = x[j][1];
					x[j][1] = x[j + 1][1];
					x[j + 1][1] = y;

				}
			}
		}
	}

	public static int Main()
	{
		int i;
		int j;
		int k;
		int t;
		int[][] x = new int[100][2];
		int n = 0;
		String s = new String(new char[150]);
		char a;
		char b;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}

		a = s.charAt(0);
		for (i = 1;s.charAt(i);i++)
		{
		   if (s.charAt(i) != a)
		   {
			   b = s.charAt(i);
			   break;
		   }
		}
		if (s.charAt(0) == a)
		{
			for (j = 0;s.charAt(j);j++)
			{

				 for (k = 0;s.charAt(k);k++)
				 {
				//	sign=0;
				   if (s.charAt(k) == a)
				   {
					   for (t = k + 1;s.charAt(t);t++)
					   {
						   if (s.charAt(t) == b)
						   {
							   s = tangible.StringFunctions.changeCharacter(s, k, 'a');
							   s = tangible.StringFunctions.changeCharacter(s, t, 'a');
							   x[n][0] = k;
							   x[n][1] = t;
							   n++;
							   break;
						   }
						   else if (s.charAt(t) == a)
						   {
							   break;
						   }
					   }
				   }


				 }

			}
		}
	/*	else
		{
		    for(j=0;s[j];j++)
			{
			   
	     	    for(k=0;s[k];k++)
				{
				//	sign=0;
				   if(s[k]==')')
				   {
				       for(t=k+1;s[t];t++)
					   {
					       if(s[t]=='(')
						   {
						       s[k]='a';
							   s[t]='a';
							   printf("%d %d\n",k,t);
							   break;
						   }
						   else if(s[t]==')')
							   break;
					   }
				   }
				   
	
				}
				
			}
		}*/

		bubble(x, n);
		for (i = 0;i < n;i++)
		{
			System.out.printf("%d %d\n",x[i][0],x[i][1]);
		}

		return 0;
	}
}

