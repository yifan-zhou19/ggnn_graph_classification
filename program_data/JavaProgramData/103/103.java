package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1000]);
		a = new Scanner(System.in).nextLine();
		int i = 0;
		int l;
		int m;
		l = a.length();
		while (i < l)
		{
			  int k = 1;
			 //int q=0;
			 m = i + 1;
			 while ((a.charAt(i) == a.charAt(m) || a.charAt(i) == a.charAt(m) - 'a'+'A' || a.charAt(i) == a.charAt(m) + 'a'-'A'))
			 {
					  k++;
					  m++;
			 }
			 if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z')
			 {
					  a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 'a'+'A');
			 }
					  //if(m==l-1)
					  //k++;
					System.out.printf("(%c,%d)",a.charAt(i),k);
					i = m;
			/*for(m=i+1;m<l;m++)
			{
			   if (a[i]==a[m]||a[i]==a[m]-'a'+'A'||a[i]==a[m]+'a'-'A')
			   {
			      k++;
			   }
			   
			    
			   else 
			    {
			        if (a[i]>='a'&&a[i]<='z')
			          a[i]=a[i]-'a'+'A';
			          //if(m==l-1)
			          //k++;
			        printf("(%c,%d)",a[i],k);
			        i=m;
			        //q++;
			        break;
			    }
			   
			}*/
		}
	System.in.read();
	System.in.read();
	System.in.read();
	System.in.read();
	System.in.read();
	System.in.read();
	System.in.read();
	System.in.read();
	System.in.read();
	}

}

