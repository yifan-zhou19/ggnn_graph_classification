public class man
{
 public String num = new String(new char[10]);
 public int age;
 public int nu;
 public man next;
}

package <missing>;

public class GlobalMembers
{
	public static int f(tangible.RefObject<String> a, int b, int n1, tangible.RefObject<String> c, int d, int n2)
	{
		int sum;
	 if (b >= 60 && d >= 60)
	 {
		 if (b > d)
		 {
	 sum = 1;
		 }
	 else if (b < d)
	 {
	  sum = -1;
	 }
	 else
	 {
	  sum = n2 - n1;
	 }
	 }
	 else if (b >= 60 && d < 60)
	 {
	  sum = 1;
	 }
		else if (b < 60 && d >= 60)
		{
			sum = -1;
		}
	 else
	 {
			sum = n2 - n1;
	 }
	 return (sum);
	}
	public static man insert(man head, man stud, int n)
	{
		man p0;
		man p1;
		man p2;
	p1 = head;
	p0 = stud;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		p0.num = tempVar.charAt(0);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		p0.age = Integer.parseInt(tempVar2);
	}
	p0.nu = n + 1;
	p0.next = null;
	if (head == null)
	{
	head = p0;
	}
	else
	{
	tangible.RefObject<String> tempRef_num = new tangible.RefObject<String>(p0.num);
	tangible.RefObject<String> tempRef_num2 = new tangible.RefObject<String>(p1.num);
		while ((f(tempRef_num, p0.age, p0.nu, tempRef_num2, p1.age, p1.nu) < 0) && (p1.next != null))
		{
			p1.num = tempRef_num2.argValue;
			p0.num = tempRef_num.argValue;
		p2 = p1;
	p1 = p1.next;
		}
		p1.num = tempRef_num2.argValue;
		p0.num = tempRef_num.argValue;
tangible.RefObject<String> tempRef_num3 = new tangible.RefObject<String>(p0.num);
tangible.RefObject<String> tempRef_num4 = new tangible.RefObject<String>(p1.num);
	if (f(tempRef_num3, p0.age, p0.nu, tempRef_num4, p1.age, p1.nu) > 0)
	{
		p1.num = tempRef_num4.argValue;
		p0.num = tempRef_num3.argValue;
		if (head == p1)
		{
			head = p0;
		}
	else
	{
		p2.next = p0;
	}
	p0.next = p1;
	}
	else
	{
		p1.num = tempRef_num4.argValue;
		p0.num = tempRef_num3.argValue;
		p1.next = p0;
	}
	}
	return (head);
	}
	public static void print(man head, int n)
	{
		man p;
	int k;
	p = head;
	for (k = 0;k < n;k++)
	{
		System.out.printf("%s\n",p.num);
	p = p.next;
	}
	}
	public static void Main()
	{
		int n;
		int k;
	man head;
	man stu;
	head = null;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (k = 0;k < n;k++)
	{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		stu = (man)malloc(LEN);
		head = insert(head, stu, k);
	}
	print(head, n);
	}
}

