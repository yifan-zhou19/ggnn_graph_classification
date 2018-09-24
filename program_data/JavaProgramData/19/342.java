package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on the parameter 'p', so pointers on this parameter are left unchanged:
	  public static String MoveNext(char * p)
	  {
		 while (Character.isLetter(*p) && *p)
		 {
			 p = p.Substring(1);
		 }
		 while (!Character.isLetter(*p) && *p)
		 {
			 p = p.Substring(1);
		 }
		 return p;
	  }

//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on the parameter 'p', so pointers on this parameter are left unchanged:
	 public static int StrWords(char * p)
	 {
		 int num = 0;
		 while (*p != '\0')
		 {
			 if (*p == ' ')
			 {
				 p = p.Substring(1);
			 }
			 else
			 {
				 num++;
				 for (; * p != ' ' && *p != '\0';p++)
				 {
					 ;
				 }

			 }
		 }
			 return num;
	 }

//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on the parameter 's2', so pointers on this parameter are left unchanged:
	 public static int CheckSame(tangible.RefObject<String> s1, char * s2)
	 {
		 String str = new String(new char[N]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		 char * p = str;
		 while (Character.isLetter(*s2))
		 {
			 *p++=*s2++;
		 }
		 *p = '\0';
		 if (strcmp(s1.argValue,str) == 0)
		 {
			 return 1;
		 }
		 else
		 {
			 return 0;
		 }
	 }
	 public static void SwapWord(tangible.RefObject<String> p2, tangible.RefObject<String> p1, tangible.RefObject<String> s)
	 {
		 String p;
		 String t1;
		 String t2;
		 String t = s.argValue;

		 int Dis;
		 int loop;
		 int k;
		 int len;
		 int tag;
		 int flag;

		 Dis = p2.argValue.length() - p1.argValue.length();
		 if (Dis < 0)
		 {
			 tag = -1;
			 Dis *= -1;
		 }
		 else if (Dis > 0)
		 {
			 tag = 1;
		 }
		 else
		 {
			 tag = 0;
		 }
		 loop = StrWords(t);
		 while (loop-- != 0)
		 {
			 if (CheckSame(p1, t) != 0)
			 {
				 switch (tag)
				 {
				 case -1:
					 p = t;
					 while (Character.isLetter(p))
					 {
						 p ++=' ';
					 }
					 p = t;
					 while (p ++ != null)
					 {
						 *(p - Dis) = p;
					 }
					 break;
				 case 1:
					 len = t.length();
					 p = t.Substring(len);
					 for (k = 0;k < t.length();k++)
					 {
						 *(p.Substring(Dis)) = p--;
					 }
					 break;
				 default:
					 break;
				 }
				 p = t;
				 t2 = p2.argValue;
				 while (t2 != null)
				 {
					 p ++= t2++;
				 }
				 while (!Character.isLetter(p))
				 {
					 p = p.Substring(1);
				 }
			 }
			 else
			 {
				 t = MoveNext(t);
			 }
		 }
	 }




	 public static int Main()
	 {
		 String sen = new String(new char[M]);
		 String w1 = new String(new char[N]);
		 String w2 = new String(new char[N]);
		 sen = new Scanner(System.in).nextLine();
		 w1 = new Scanner(System.in).nextLine();
		 w2 = new Scanner(System.in).nextLine();
	 tangible.RefObject<String> tempRef_w2 = new tangible.RefObject<String>(w2);
	 tangible.RefObject<String> tempRef_w1 = new tangible.RefObject<String>(w1);
	 tangible.RefObject<String> tempRef_sen = new tangible.RefObject<String>(sen);
		 SwapWord(tempRef_w2, tempRef_w1, tempRef_sen);
		 sen = tempRef_sen.argValue;
		 w1 = tempRef_w1.argValue;
		 w2 = tempRef_w2.argValue;
		 System.out.println(sen);

		 return 0;
	 }
}

