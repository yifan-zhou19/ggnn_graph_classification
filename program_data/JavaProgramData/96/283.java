package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 String a = new String(new char[101]);
	 String b = new String(new char[100]);
	 int i;
	 int x;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 a = tempVar.charAt(0);
	 }
	 if (a.charAt(1) == '\0')
	 {
		 System.out.print("0\n");
					 System.out.printf("%c\n",a.charAt(0));
	 } //printf("%s\n",a);
	 else
	 {
		 if ((((a.charAt(1) == '1') || (a.charAt(1) == '2')) && (a.charAt(2) == '\0')) && (a.charAt(0) == '1'))
		 {
			 System.out.print("0\n");
					 System.out.printf("%s\n",a);
		 }
		 else
		 {
	 x = 10 * (a.charAt(0) - '0') + (a.charAt(1) - '0'); //printf("%d\n",x);
	 if (x >= 13)
	 {
		 for (i = 0;a.charAt(i + 1) != '\0';i++)
		 {
			x = 10 * (a.charAt(i) - '0') + (a.charAt(i + 1) - '0'); //printf("%d\n",x);
			b = tangible.StringFunctions.changeCharacter(b, i, x / 13 + '0'); //printf("%c\n",b[i]);
			a = tangible.StringFunctions.changeCharacter(a, i + 1, x - 13 * (b.charAt(i) - '0') + '0'); //printf("%c\n",a[i+1]);
		 }
		  b = tangible.StringFunctions.changeCharacter(b, i, '\0');
	 }
		else
		{
		  a = tangible.StringFunctions.changeCharacter(a, 1, x + '0'); //printf("x  %d\n",x);  printf("c  %c\n",a[1]);
		  for (i = 1;a.charAt(i + 1) != '\0';i++)
		  {
		   x = 10 * (a.charAt(i) - '0') + (a.charAt(i + 1) - '0'); // printf("%d\n",x);
		   b = tangible.StringFunctions.changeCharacter(b, i - 1, x / 13 + '0'); //printf("%c\n",b[i-1]);
		  a = tangible.StringFunctions.changeCharacter(a, i + 1, x - 13 * (b.charAt(i - 1) - '0') + '0'); //printf("%c\n",a[i+1]);
		  }
		  b = tangible.StringFunctions.changeCharacter(b, i - 1, '\0');
		}
	 System.out.printf("%s\n",b);
	 System.out.printf("%c\n",a.charAt(i));
		 }
	 }
	 System.in.read();
	 System.in.read();
	 System.in.read();
	 return 0;
	}
}

