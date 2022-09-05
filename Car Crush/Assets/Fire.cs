using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class Fire : MonoBehaviour
{

    public GameObject bullet;
    GameObject bulletClone;
    public float speed;
    // Start is called before the first frame update
    void Start()
    {
        
    }

    // Update is called once per frame
    void Update()
    {
        hire();
    }

    void hire()
    {
        if (Input.GetKeyDown(KeyCode.Space))
        {
            bulletClone = Instantiate(bullet, transform.position, transform.rotation);
            bulletClone.GetComponent<Rigidbody2D>().velocity = transform.up * speed;
            Destroy(bulletClone, 0.5f);
        }
    }
}
