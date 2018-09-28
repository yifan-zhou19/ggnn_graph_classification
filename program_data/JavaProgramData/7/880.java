package <missing>;

public class GlobalMembers
{
	public static int pd(tangible.RefObject<String> p, tangible.RefObject<String> sub, int n)
	{
		int j;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * x;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * y;
		int zhi = 0;
		for (j = 0,x = p.argValue,y = sub.argValue;j < n;j++,x++,y++)
		{
			if (*x == *y)
			{
				zhi = 1;
			}
			else
			{
				zhi = 0;
				break;
			}
		}

		return (zhi);

	}
	public static void Main()
	{
		String a;
		String sub;
		String rep;
		String t;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		int i;
		int n;
		int m;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		a = (String)malloc(250 * (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		sub = (String)malloc(1000);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		rep = (String)malloc(1000);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		t = (String)malloc(1000);
		a = new Scanner(System.in).nextLine();
		sub = new Scanner(System.in).nextLine();
		rep = new Scanner(System.in).nextLine();
		for (n = 0,p = sub; * p != '\0';p++,n++)
		{
			; //????
		}
		for (m = 0,p = a; * p != '\0';p++,m++)
		{
			; //????
		}

		for (p = a;p < a.Substring(m) - n;p++)
		{
	  tangible.RefObject<String> tempRef_p = new tangible.RefObject<String>(p);
	  tangible.RefObject<String> tempRef_sub = new tangible.RefObject<String>(sub);
		  if (pd(tempRef_p, tempRef_sub, n) == 1)
		  {
			  sub = tempRef_sub.argValue;
			  p = tempRef_p.argValue;
			  break;
		  }
		  else
		  {
			  sub = tempRef_sub.argValue;
			  p = tempRef_p.argValue;
		  }
		}
		t = p + n;
	  tangible.RefObject<String> tempRef_p2 = new tangible.RefObject<String>(p);
	  tangible.RefObject<String> tempRef_sub2 = new tangible.RefObject<String>(sub);
		  if (pd(tempRef_p2, tempRef_sub2, n) == 1)
		  {
			  sub = tempRef_sub2.argValue;
			  p = tempRef_p2.argValue;
			  p = rep;
		  }
		  else
		  {
			  sub = tempRef_sub2.argValue;
			  p = tempRef_p2.argValue;
		  }
	 p + n = t;
		System.out.println(a);

	}
}

