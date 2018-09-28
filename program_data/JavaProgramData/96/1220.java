package <missing>;

public class GlobalMembers
{
	public static int sn(char s)
	{
		String p;
		p = s;
		return Integer.parseInt(p);
	}
	public static int yu = 0;
	public static void chufa(tangible.RefObject<String> p1, tangible.RefObject<String> p2)
	{
		 int l1 = p1.argValue.length();
		 if (l1 == 1)
		 {
				  p2.argValue.charAt(0) = '0';
				  yu = sn(p1.argValue.charAt(0));
		 }
		 for (int i = 0;i < l1 - 1;i++)
		 {
				 int flg = 0;
				 if (i == 0)
				 {
					 flg = 1;
				 }
				 int temp = 0;
				 temp = (flg * 10 * sn(p1.argValue.charAt(i)) + sn(p1.argValue.charAt(i + 1)) + yu * 10) % 13;
				 p2.argValue.charAt(i) = '0' + (flg * 10 * sn(p1.argValue.charAt(i)) + sn(p1.argValue.charAt(i + 1)) + yu * 10 - temp) / 13;
				 yu = temp;
		 }
	}
	public static int Main()
	{
		  String s = new String(new char[100]);
		  s = new Scanner(System.in).nextLine();
		  int len = s.length();
		  String shang = new String(new char[len - 1]);
	  tangible.RefObject<String> tempRef_s = new tangible.RefObject<String>(s);
	  tangible.RefObject<String> tempRef_shang = new tangible.RefObject<String>(shang);
		  chufa(tempRef_s, tempRef_shang);
		  shang = tempRef_shang.argValue;
		  s = tempRef_s.argValue;
		  for (int i = 0;;i++)
		  {
				  if (i == 0 && shang.charAt(i) == '0')
				  {
				  if (len == 1 || len == 2)
				  {
				  System.out.printf("%c",shang.charAt(i));
				  }
				  else
				  {
					  continue;
				  }
				  }
				  else if (i != len - 1)
				  {
					  System.out.printf("%c",shang.charAt(i));
				  }
				  if (i == len - 1)
				  {
				  break;
				  }

		  }
		  System.out.printf("\n%d",yu);

	}

}

