package <missing>;

public class GlobalMembers
{
	public static int pdshuzi(char zi)
	{
		int zhi1;
		if (zi >= '0' && zi <= '9')
		{
			zhi1 = 1;
		}
		else
		{
			zhi1 = 0;
		}
		return (zhi1);
	}

	public static int pdzimu(char zi)
	{
		int zhi2;
		if ((zi >= 'a' && zi <= 'z') || (zi >= 'A' && zi <= 'Z'))
		{
			zhi2 = 1;
		}
		  else
		  {
			  zhi2 = 0;
		  }
		  return (zhi2);
	}

	public static int sort(tangible.RefObject<String> head)
	{
		String t;
		int zhi;
		int flag = 1;
		t = head.argValue;
		if (pdzimu(t) == 1 || t == '_')
		{
			zhi = 1;
		}
		else
		{
			zhi = 0;
			return (zhi);
		}

		t = t.Substring(1);
		for (; t != '\0';t++)
		{
			if (pdzimu(t) == 1 || pdshuzi(t) == 1 || t == '_')
			{
				flag = 1;
			}
			  else
			  {
				  flag = 0;
			  }
			  if (flag == 0)
			  {
				  return (0);
				  break;
			  }
		}
		if (flag == 1)
		{
			return (1);
		}

	}

	public static void Main()
	{
	  String[] name = new String[100];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	  String * p;
	  int n;
	  int i;

	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (p = name,i = 0;i < n;i++,p++)
	  {
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		  *p = (String)malloc(90 * (Character.SIZE / Byte.SIZE));
	  }

	  for (p = name;p < name + n;p++)
	  {
		  *p = new Scanner(System.in).nextLine();
	  }

	  for (p = name;p < name + n;p++)
	  {
		  System.out.printf("%d\n",sort(*p));
	  }
	}
}

