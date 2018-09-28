public class patient
{
	public String ID = new String(new char[11]);
	public int age;
	public patient next;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		patient old;
		patient young;
		patient ot;
		patient yt;
		patient p;
		patient paixu = new patient(struct patient * h);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		ot = null;
		yt = null;
		for (i = 0;i < n;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p = (patient)malloc(len);
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p.ID = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				p.age = Integer.parseInt(tempVar3);
			}
			p.next = null;
			if (p.age < 60)
			{
				if (yt != null)
				{
					yt.next = p;
				}
				else
				{
					young = p;
				}
				yt = p;
			}
			else
			{
				if (ot != null)
				{
					ot.next = p;
				}
				else
				{
					old = p;
				}
				ot = p;
			}
		}
		old = paixu(old);
		while (old != null)
		{
			System.out.printf("%s\n",old.ID);
			old = old.next;
		}
		while (young != null)
		{
			System.out.printf("%s\n",young.ID);
			young = young.next;
		}
	}
	public static patient paixu(patient h)
	{
		patient hh = h;
		patient before;
		patient after;
		h = h.next;
		hh.next = null;
		while (h != null)
		{
			before = hh;
			if (before.age < h.age)
			{
				hh = h;
				after = h.next;
				h.next = before;
				h = after;
			}
			else
			{
				while (before.next != null)
				{
					if (before.next.age >= h.age)
					{
						before = before.next;
					}
					else
					{
						break;
					}
				}
				after = h.next;
				h.next = before.next;
				before.next = h;
				h = after;
			}
		}
		return hh;
	}


}

