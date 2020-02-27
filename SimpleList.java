// Ran Duan
// Class ID: 228
// CSE 360 Assignment #1
// Description: This class is to create the class SimpleList. Create and change 10 integer numbers in an array list.

public class SimpleList 
{
	private int[] list;
	private int count;
	
	public SimpleList()			//create an array to have 10 integer numbers.
	{
		this.count = 0;
		this.list = new int[10];
	}

	public void add(int num)
	{
		if (count >= 0) 			//Fill in the Numbers one by one.
		{
			list[count] = num;
			count ++;
		}
		else if (count == list.length)		//When the list is full, the last number falls out the list.
		{
			int i = count / 2;
			resize(count + i);
		}
		else 
		{
			list[0] = num;
			count++;
		}
	}
	
	private void resize(int d) 
	{
		int List[] = new int[d];
		for (int i = 0; i < d && i < count; i++)
		{
			List[i] = list[i];
		}
		List = list;
		
	}

	public void remove(int num)
	{
		int a = list.length;
		int rm = -1;
		for(int i=0; i<a; i++)
		{
			if (list[i]==num)
			{
				rm = i;			//when the parameter moves out, the others values move down.
				this.count--;
			}
		}
			if (rm != -1)
			{
				for(int i=rm;i<a-1;i++)
				{
					list[i] = list[i+1];
				}
				list[a-1]=0;
			}
				
		int n = 3 * list.length / 4;

	    if (count < n) 
	    {
	    	resize(count);
	    }
	    
	}
	
	public void append (int num)
	{
		if (count == list.length)		//When the list is full, the last number falls out the list.
		{
			int i = count / 2;
			resize(count + i);
		}
		else 
		{
			list[0] = num;
			count++;
		}
	}
	
	public int first()
	{
		if (count == 0) 
		{
			return -1;
        }
		return first();
	}
	
	public int last()
	{
		if (count == list.length) 
		{
			return -1;
        }
		return last();
	}
	
	 public int size() 
	 {
		 return list.length;
	 }
	
	public int count()
	{
		return this.count;
	}
	
	public String toString()
	{
		String str = "";				//return the list as string.
		for (int i = 0; i < count; i++) 
		{
			str += list[i];
	        if (i != count - 1) 
	        {
	        	str += " ";
	        }
		}
	    return str;
		
	}
	
	public int search(int num)
	{
		int r = -1;
		for (int i = 0; i < count; i++)
		{
			if(list[i] == num)
			{
				r = i;
			}
		}
		return r;				//if the parameter not in the list, return r = -1.
	}
	
}
