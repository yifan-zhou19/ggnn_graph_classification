package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int[] z = new int[5];
	   int[] q = new int[5];
	   int[] s = new int[5];
	   int[] l = new int[5];
	   int[] w = new int[4];
	   int i;
	   int a;
	   int b;
	   int c;
	   int d;
	   int j;
	   int t;
	   String ch = new String(new char[5]);
	   for (i = 0;i < 5;i++)
	   {
		 z[i] = i + 1;
		 q[i] = i + 1;
		 s[i] = i + 1;
		 l[i] = i + 1;
	   }
	   for (a = 0;a < 5;a++)
	   {
		  for (b = 0;b < 5;b++)
		  {
			 for (c = 0;c < 5;c++)
			 {
			 for (d = 0;d < 5;d++)
			 {
			  if (z[a] + q[b] == s[c] + l[d] && z[a] + l[d] > s[c] + q[b] && z[a] + s[c] < q[b])
			  {
			  //{printf("%d %d %d %d\n",a,b,c,d);}
					w[0] = a;
					w[1] = b;
					w[2] = c;
					w[3] = d;
				  ch = tangible.StringFunctions.changeCharacter(ch, a, 'z');
				  z[a] = a + 1;
	   ch = tangible.StringFunctions.changeCharacter(ch, b, 'q');
	   q[b] = b + 1;
	   ch = tangible.StringFunctions.changeCharacter(ch, c, 's');
	   s[c] = c + 1;
	   ch = tangible.StringFunctions.changeCharacter(ch, d, 'l');
	   l[d] = d + 1;


			  }

			 }
			 }
		  }
	   }


		for (i = 0;i < 4;i++)
		{
		 //printf("%d\n",w[i]);                
		}
	   for (j = 0;j < 3;j++)
	   {
		   for (i = 0;i < 3 - j;i++)
		   {
			if (w[i] < w[i + 1])
			{
			   t = w[i];
			   w[i] = w[i + 1];
			   w[i + 1] = t;
			}
		   }
	   }
		for (i = 0;i < 4;i++)
		{
		// printf("%d\n",w[i]);                
		}
	   for (i = 0;i < 4;i++)
	   {
		  t = w[i];
		 System.out.printf("%c %d\n",ch.charAt(t),t * 10 + 10);
	   }
		  //printf("%d %d %d %d\n",a,b,c,d);
	System.in.read();
	System.in.read();
	System.in.read();
	}
}

