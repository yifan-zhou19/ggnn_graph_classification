public class guahao
{
	public String num = new String(new char[20]);
	public int year;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int m;
		guahao temp = new guahao();
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		guahao * p = new guahao();
		guahao t;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		guahao * p1 = new guahao();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		m = n;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		guahao bingren = (guahao)malloc(sizeof(guahao) * n);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		guahao bingren1 = (guahao)malloc(sizeof(guahao) * m);
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: p=bingren;
		p.copyFrom(bingren);
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: p1=bingren1;
		p1.copyFrom(bingren1);
		for (;p < bingren + n;p++,p1++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p.num = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				p.year = Integer.parseInt(tempVar3);
			}
			*p1 = p;
		}
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: p=bingren;
		p.copyFrom(bingren);
		for (i = 0;p < bingren + n - 1;p++,i++)
		{
			for (t = bingren;t < bingren + n - 1 - i;t++)
			{
				if (t.year < (*(t + 1)).year)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=*t;
					temp.copyFrom(t);
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: *t=*(t+1);
					t.copyFrom((t + 1));
					*(t + 1) = temp;
				}
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: p=bingren;
		p.copyFrom(bingren);
		for (;p < bingren + n;p++)
		{
			if (p.year >= 60)
			{
				System.out.printf("%s\n",p.num);
			}
		}
		for (p1 = bingren1;p1 < bingren1 + m;p1++)
		{
			if (p1.year < 60)
			{
				System.out.printf("%s\n",p1.num);
			}
		}
		bingren = null;
		bingren1 = null;
		return 0;
	}


}

