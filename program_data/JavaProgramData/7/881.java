package <missing>;

public class GlobalMembers
{
	public static int bd(tangible.RefObject<String> hed, tangible.RefObject<String> zi, int m)
	{
		int val = 0;
		int j;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * t1;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * t2;
		for (t1 = hed.argValue,t2 = zi.argValue,j = 0;j < m;t1++,t2++,j++)
		{
			if (*t1 == *t2)
			{
				val = 1;
			}
		else
		{
			val = 0;
			break;
		}
		}
		return (val);
	}
	public static void Main()
	{
		String yuan;
		String zi;
		String rep;
		String med;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		yuan = (String)malloc(260 * (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		zi = (String)malloc(260 * (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		rep = (String)malloc(260 * (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		med = (String)malloc(260 * (Character.SIZE / Byte.SIZE));

		yuan = new Scanner(System.in).nextLine();
		zi = new Scanner(System.in).nextLine();
		rep = new Scanner(System.in).nextLine();

//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		int n;
		int m;
		int zhi = 0;
		int t;

		for (p = yuan,n = 0; * p != '\0';p++,n++)
		{
			;
		}
		for (p = zi,m = 0; * p != '\0';p++)
		{
			m++;
		}
		for (p = rep,t = 0; * p != '\0';p++)
		{
			t++;
		}

		/*?????????*/

		/*????*/
		for (p = yuan;p < yuan.Substring(n) - m + 1;p++)
		{
	tangible.RefObject<String> tempRef_p = new tangible.RefObject<String>(p);
	tangible.RefObject<String> tempRef_zi = new tangible.RefObject<String>(zi);
		if (bd(tempRef_p, tempRef_zi, m) == 1)
		{
			zi = tempRef_zi.argValue;
			p = tempRef_p.argValue;
		zhi = 1;
		break;
		}
		else
		{
			zi = tempRef_zi.argValue;
			p = tempRef_p.argValue;
		}
		}

			if (zhi == 1)
			{
				med = p + m;
					p = rep;
					p + t = med;
			}
		System.out.println(yuan);

	}

}

