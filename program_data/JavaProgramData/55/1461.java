package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
			 int a;
			 int b;
			 int i;
			 int m = 0;
			 int n = 0;
			 char w;
			 int f;
			 String s = new String(new char[64]);
			 String t = new String(new char[64]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
			 char * p;
			 String r;
			 p = s;
			 r = t;
			 String tempVar = ConsoleInput.scanfRead();
			 if (tempVar != null)
			 {
				 a = Integer.parseInt(tempVar);
			 }
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 s = tempVar2.charAt(0);
			 }
			 String tempVar3 = ConsoleInput.scanfRead();
			 if (tempVar3 != null)
			 {
				 b = Integer.parseInt(tempVar3);
			 }
			 while ((*p) != '\0')
			 {
					  if ((*p) >= 'A' && (*p) <= 'Z')
					  {
					  n = n * a + ((*p) - 'A' + 10);
					  }
					  else if ((*p) >= 'a' && (*p) <= 'z')
					  {
					  n = n * a + ((*p) - 'a' + 10);
					  }
					  else if ((*p) >= '0' && (*p) <= '9')
					  {
					  n = n * a + ((*p) - '0');
					  }
					  p++;
			 }
			 if (n == 0)
			 {
			 System.out.printf("%d",n);
			 }
			 while (n != 0)
			 {

					  f = n % b;
					  n = n / b;
					  if (f > 9)
					  {
					  r = 'A' + f - 10;
					  }
					  else
					  {
						  r = f + '0';
					  }
					  r = r.Substring(1);
					  m++;
			 }
			 for (i = 0;i < m / 2;i++)
			 {
					  w = t.charAt(i);
					  t = tangible.StringFunctions.changeCharacter(t, i, t.charAt(m - 1 - i));
					  t = tangible.StringFunctions.changeCharacter(t, m - 1 - i, w);
			 }
			 for (i = 0;i < m;i++)
			 {
					  System.out.printf("%c",t.charAt(i));
			 }

	}

}

