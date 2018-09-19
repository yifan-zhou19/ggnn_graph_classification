package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	String s;
	String a;
	String b;
	String q;
	String temp1;
	String temp2;
	int i;
	int j = 0;
	int len;
	int lenb;
	int k;
	int flag = 1;
	int head = 0;
	int tail = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	s = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	a = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	b = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	temp1 = (String)malloc(200 * (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	temp2 = (String)malloc(200 * (Character.SIZE / Byte.SIZE));
	s = new Scanner(System.in).nextLine();
	a = new Scanner(System.in).nextLine();
	b = new Scanner(System.in).nextLine();

	len = s.length();
	lenb = b.length();
	for (i = 0;i < len;i++)
	{
		if (*(s.Substring(i)) != ' ')
		{
			if (flag == 1)
			{
				head = i;
				flag = 0;
			}
			*(temp1.Substring(j)) = *(s.Substring(i));
			j++;
		}
		else
		{
			q = s.Substring(i);
			tail = i;
			flag = 1;
			*(temp1.Substring(j)) = '\0';
			j = 0;
			if (!strcmp(temp1,a))
			{
				temp2 = q;
				for (k = 0;k < lenb;k++)
				{
					*(s.Substring(head) + k) = *(b.Substring(k));
				}
				*(s.Substring(head) + k) = '\0';
				s += temp2;
			}
			temp1 = "\0";
			temp2 = "\0";
		}
	}
	*(temp1.Substring(j)) = '\0';
	if (!strcmp(temp1,a))
	{

				for (k = 0;k < lenb;k++)
				{
					*(s.Substring(head) + k) = *(b.Substring(k));
				}
				*(s.Substring(head) + k) = '\0';

	}
	System.out.println(s);
	}


}
