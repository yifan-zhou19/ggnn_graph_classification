package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String a = new String(new char[1000]);
		  String d = new String(new char[100]);
		  int[] c = new int[100];
		  int[] b = new int[100];
		  int x = 0;
		  int i;
		  int j;
		  int l;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  a = tempVar.charAt(0);
		  }
			   for (i = 0;a.charAt(i) != '\0';i++)
			   {
					 c[i] = a.charAt(i) - '0';
			   } //????? ??c?0??c?i�1?
			   if (i <= 1)
			   {
			   d = tangible.StringFunctions.changeCharacter(d, 0, '0');
			   d = tangible.StringFunctions.changeCharacter(d, 1, '\0');
			   x = c[0];
			   }
			   else if (i == 2 && c[0] == 1 && c[1] < 3)
			   {
					d = tangible.StringFunctions.changeCharacter(d, 0, '0');
					d = tangible.StringFunctions.changeCharacter(d, 1, '\0');
					x = c[0] * 10 + c[1];
			   }
			   else
			   {
					if (c[0] == 1 && c[1] < 3)
					{
					  b[0] = (c[0] * 100 + c[1] * 10 + c[2]) / 13; //?????13
					  x = (c[0] * 100 + c[1] * 10 + c[2]) % 13; //????
					  j = 3;
					}
			   else
			   {
					  b[0] = (c[0] * 10 + c[1]) / 13; //?????13
					  x = (c[0] * 10 + c[1]) % 13; //????
					  j = 2;
			   }
				int k = 0;
				for (;j < i;j++)
				{
					   k++;
					   b[k] = (x * 10 + c[j]) / 13; //????10??????
					   x = (x * 10 + c[j]) % 13; //?????
				}
			   for (j = 0;j <= k;j++)
			   {
					   d = tangible.StringFunctions.changeCharacter(d, j, b[j] + '0');
			   }
			   d = tangible.StringFunctions.changeCharacter(d, k + 1, '\0');
			   }
			   System.out.printf("%s\n%d",d,x);
		  System.in.read();
		  System.in.read();
	}


}

